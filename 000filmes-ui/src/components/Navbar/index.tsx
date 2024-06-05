import { ReactComponent as GithubIcon } from "assets/img/github.svg";
import "./styles.css";

function Navbar() {
    return (
      <header>
        <nav className="container">
          <div className="mt-nav-content">
            <h1>MTS Filmes</h1>
              <a href="https://github.com/mtstechnologies" target="_blank" rel="noreferrer">
                  <div className="mt-contact-container">
                      <GithubIcon />
                      <p className="mt-contact-link">/mtstechnologies</p>
                  </div>
              </a>
          </div>
        </nav>
      </header>
    );
  }
export default Navbar;