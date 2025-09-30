"use client";
import Link from "next/link";
import { usePathname } from "next/navigation";

export default function Header() {
  const pathname = usePathname();
  const active = (href) => (pathname === href ? { fontWeight: "bold" } : {});
  return (
    <header style={{ padding: 16, borderBottom: "1px solid #eee" }}>
      <nav style={{ display: "flex", gap: 12 }}>
        <Link href="/" style={active("/")}>Home</Link>
        <Link href="/views/movies" style={active("/movies")}>Movies</Link>
        <Link href="/views/series" style={active("/series")}>Series</Link>
      </nav>
    </header>
  );
}
