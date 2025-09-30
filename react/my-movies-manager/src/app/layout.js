import "./globals.css";
import Header from "./components/Header";

export const metadata = {
  title: "Next SPA Movies",
  description: "Home, Movies, Series",
};

export default function RootLayout({ children }) {
  return (
    <html lang="pt-BR">
      <body style={{ maxWidth: 960, margin: "0 auto", padding: 16 }}>
        <Header />
        <main>{children}</main>
      </body>
    </html>
  );
}
