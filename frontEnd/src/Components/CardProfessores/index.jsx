import React from "react";
import Style from "./CardProfessores.module.css";
import RelatorioAluno from './Components/RelatorioAluno'


const index = () => {
  const turma = [
    {
      Disciplina: "Logica de Programação",
      Media: 7.5,
      Frequencia: "90%",
      Acima: "30",
      Abaixo: "20",
      QtdAlunos: "50",
    },
    {
      Disciplina: "Logica de Programação",
      Media: 5.0,
      Frequencia: "90%",
      Acima: "30",
      Abaixo: "20",
      QtdAlunos: "50",
    },
    {
      Disciplina: "Logica de Programação",
      Media: 5.0,
      Frequencia: "90%",
      Acima: "30",
      Abaixo: "20",
      QtdAlunos: "50",
    },
    
  ];
  return (
    <>
    <h1 className={Style.titleTurma}> C.C - 7NA </h1>
        <section className={Style.bodyGeral}>  
       
        <section className={Style.sectionCard}>
        <RelatorioAluno/>
          {/* <section className={Style.bodyCard}>
            {turma.map((card, key) => {
              return (
                <div className={Style.profCard} key={key}>
                  <div className={Style.codCardProf}>
                    <div className={Style.containerDisciplina}>
                      <h3 className={Style.titleDisciplina}>
                        {card.Disciplina}
                      </h3>
                    </div>
                    <section className={Style.cardInfos}>
                      <section className={Style.infCard}>
                        <p>Média : <span className ={ card.Media > 7 ? Style.aprovado : Style.reprovado} >{card.Media}</span></p>
                        <p>Frequencia : <span>{parseInt(card.Frequencia)}%</span></p>
                      </section>
                      <section className={Style.infCard}>
                        <p>Acima da media : <span className={Style.aprovado}>{parseInt(card.Acima)}</span></p>
                        <p>Abaixo da media : <span className={Style.reprovado}>{parseInt(card.Abaixo)}</span></p>
                        <p>Qtd . Alunos : {parseInt(card.QtdAlunos)}</p>
                      </section>
                    </section>
                  </div>
                </div>
              );
            })}
          </section> */}
        </section>
      </section>
    </>
  );
};

export default index;
