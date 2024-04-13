import React from "react";

import Style from "./navbar.module.css";

const index = () => {
  const menuNav = ["Inicio", "Sobre", "Mais"];
  return (
    <nav className={Style.navbar}>
      <section className={Style.containerNavbar}>
        <div className={Style.logo}>
          <img className={Style.image} src="../../../public/logo.svg"></img>
        </div>
        <ul className={Style.containerItens}>
          {menuNav.map((texto) => (
            <li className={Style.li}>
              <a className={Style.p}>{texto}</a>
            </li>
          ))}
        </ul>
      </section>
    </nav>
  );
};

export default index;
