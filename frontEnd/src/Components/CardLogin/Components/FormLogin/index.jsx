import React from 'react'
import Style from './FormLogin.module.css'
import { useNavigate } from 'react-router-dom';

const index = () => {
  const navigate = useNavigate()
  const handleFunction = ()=>{
    navigate('/')
  }
  return (
    <>
      <h2 className={Style.loginTitle}>LOGIN</h2>

      <section className={Style.bodyForm}>
        <section className={Style.containerInput}>
          <input type="text" placeholder='Matrícula' className={Style.inputMatricula} />
          <input type="password" placeholder='Senha' className={Style.inputPassword} />
          <div className={Style.containerButton}><button onClick={handleFunction} className={Style.buttonEntrar}>Entrar</button></div>
        </section>
      </section>
    </>
  )
}

export default index