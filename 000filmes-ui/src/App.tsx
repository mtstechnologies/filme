import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import Navbar from "./components/Navbar";
import Listing from 'pages/Listing';
import Form from 'pages/Form';

function App() {
  return (
    <>
      <BrowserRouter>{/*aqui é iniciado a configuracao de ativacao das rotas*/}
        <Navbar />{/*essa posicao garante que toda pagina ira carregar o header*/}
        <Routes>
          <Route path="/" element={<Listing />} />
          <Route path="/form">
            <Route path=":movieId" element={<Form />} />{/*sub-rota para pegar o parametro*/}
          </Route>
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
