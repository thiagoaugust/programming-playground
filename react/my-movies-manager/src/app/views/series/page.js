import Image from "next/image";

const BASE = "https://api.themoviedb.org/3";

async function getPopularSeries() {
  const res = await fetch(`${BASE}/tv/popular?language=pt-BR&page=1`, {
    headers: {
      Authorization: `Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJjYmQ5YmY5MWY1NTliYTRmNGUwNWM3NDFhN2VmNzNjZCIsIm5iZiI6MTc1OTIyOTc0Ny43OTUsInN1YiI6IjY4ZGJiNzMzY2I1NWI5MGIyM2I0MjBjZSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.U2h8l9l1zOPwd41dJW8QGHoU1rg-5JZJD1mksFOSt_s`, // <- V4
      Accept: "application/json",
    },
  });

  const data = await res.json().catch(() => ({}));

  if (!res.ok) {
    const msg = data?.status_message || `HTTP ${res.status}`;
    throw new Error(`TMDB falhou: ${msg}`);
  }

  const results = Array.isArray(data?.results) ? data.results : [];
  return results;
}

export default async function SeriesPage() {
  const series = await getPopularSeries();

  if (series.length === 0) {
    return (
      <main>
        <h1>Séries Populares</h1>
        <p>Nenhuma série encontrada. Verifique suas credenciais da TMDB.</p>
      </main>
    );
  }

  return (
    <main>
      <h1>Filmes Populares</h1>
      <ul style={{ display: "grid", gridTemplateColumns: "repeat(auto-fill, minmax(160px, 1fr))", gap: 16 }}>
        {series.map((m) => (
          <li key={m.id} style={{ listStyle: "none" }}>
            <Image
              src={m.poster_path ? `https://image.tmdb.org/t/p/w300${m.poster_path}` : "/placeholder.png"}
              alt={m.title ? m.title : m.name}
              width={160}
              height={240}
              style={{ display: "block", width: "100%", height: "auto", borderRadius: 8 }}
              unoptimized
            />
            <div style={{ marginTop: 8, fontWeight: 600 }}>{m.title}</div>
            <small>{m.release_date}</small>
          </li>
        ))}
      </ul>
    </main>
  );
}
