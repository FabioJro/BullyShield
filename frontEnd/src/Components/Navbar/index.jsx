import React from "react";

import Style from "./navbar.module.css";
import logo from "/public/logo.svg"

const index = () => {
  const menuNav = ["Inicio", "Sobre", "Mais"];
  return (
    <header className={Style.bodyNavbar}>
      <nav className={Style.navbar}>
        <section className= {Style.bodyItens}>
          <section className={Style.containerNavbar}>
            <div className={Style.logo}>
              <img className={Style.image} src={logo}></img>
            </div>
            <ul className={Style.containerItens}>
              {menuNav.map((texto) => (
                <li className={Style.li}>
                  <a className={Style.p}>{texto}</a>
                </li>
              ))}
            </ul>
          </section>
        </section>
      </nav>
    </header>
  );
};

export default index;
