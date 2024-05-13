import React, { useState } from "react";
import Style from "./FormLogin.module.css";
import { useNavigate } from "react-router-dom";

const index = () => {
  const [username, usernameupdate] = useState(" ");
  const [password, passwordupdate] = useState(" ");
 
  const usenavigate = useNavigate()
  const ProceedLogin = (e) => {
    e.preventDefault();
    if (validate()) {
      fetch(username)
        .then((res) => {
          return res.json();
        })
        .then((resp) => {
          // console.log(resp)
          if (Object.keys(resp).length === 0) {
            toast.error("Por favor , coloque um usuario valido");
          } else {
            if (resp.password === password) {
              toast.success('Sucess');
              sessionStorage.setItem('username',username);
              useNavigate('')
            } else {
              toast.error("Por favor , coloque uma credencial valida");
            }
          }
        })
        .catch((err) => {
          toast.error("Falha no login" + err.message);
        });
    }
  };

  const navigate = useNavigate();
  const handleFunction = () => {
    navigate("/inicio");
  };
  return (
    <>
      <h2 className={Style.loginTitle}>LOGIN</h2>

      <section className={Style.bodyForm}>
        <section onSubmit={ProceedLogin} className={Style.containerInput}>
          <input
            value={username}
            onChange={(e) => usernameupdate(e.target.value)}
            type="text"
            placeholder="Matrícula"
            className={Style.inputMatricula}
          />
          <input
            value={password}
            onChange={(e) => passwordupdate(e.target.value)}
            type="password"
            placeholder="Senha"
            className={Style.inputPassword}
          />
          <div className={Style.containerButton}>
            <button
              type="submit"
              onClick={handleFunction}
              className={Style.buttonEntrar}
            >
              Entrar
            </button>
          </div>
        </section>
      </section>
    </>
  );
};

export default index;
