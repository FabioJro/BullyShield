import React from "react";
import Style from "./RelatorioAluno.module.css";

const index = () => {
  const alunos = [
    {
      nome: "Diego",
      matricula: 12313222,
      media: 7.5,
      frequencia: "50",
    },
    {
      nome: "Mateus Candido",
      matricula: 12313222,
      media: 2.0,
      frequencia: "10",
    },
    {
      nome: "Vanildo",
      matricula: 42356622,
      media: 9.0,
      frequencia: "90",
    },
    {
      nome: "Marcello",
      matricula: 12345322,
      media: 3.0,
      frequencia: "20",
    },
    {
      nome: "Marcello",
      matricula: 12345322,
      media: 3.0,
      frequencia: "20",
    },
    {
      nome: "Marcello",
      matricula: 12345322,
      media: 3.0,
      frequencia: "20",
    },
    {
      nome: "Marcello",
      matricula: 12345322,
      media: 3.0,
      frequencia: "20",
    },
    {
      nome: "Marcello",
      matricula: 12345322,
      media: 3.0,
      frequencia: "20",
    },
    {
      nome: "Marcello",
      matricula: 12345322,
      media: 3.0,
      frequencia: "20",
    },
    {
      nome: "Marcello",
      matricula: 12345322,
      media: 3.0,
      frequencia: "20",
    },
    {
      nome: "Marcello",
      matricula: 12345322,
      media: 3.0,
      frequencia: "20",
    },
    {
      nome: "Marcello",
      matricula: 12345322,
      media: 3.0,
      frequencia: "20",
    },
    {
      nome: "Marcello",
      matricula: 12345322,
      media: 3.0,
      frequencia: "20",
    },
    {
      nome: "Marcello",
      matricula: 12345322,
      media: 3.0,
      frequencia: "20",
    },
    {
      nome: "Marcello",
      matricula: 12345322,
      media: 3.0,
      frequencia: "20",
    },
    {
      nome: "Marcello",
      matricula: 12345322,
      media: 3.0,
      frequencia: "20",
    },
    {
      nome: "Marcello",
      matricula: 12345322,
      media: 3.0,
      frequencia: "20",
    },
    {
      nome: "Marcello",
      matricula: 12345322,
      media: 3.0,
      frequencia: "20",
    },
    {
      nome: "Marcello",
      matricula: 12345322,
      media: 3.0,
      frequencia: "20",
    },
    {
      nome: "Marcello",
      matricula: 12345322,
      media: 3.0,
      frequencia: "20",
    },
    {
      nome: "Marcello",
      matricula: 12345322,
      media: 3.0,
      frequencia: "20",
    },
    {
      nome: "Marcello",
      matricula: 12345322,
      media: 3.0,
      frequencia: "20",
    },
    {
      nome: "Marcello",
      matricula: 12345322,
      media: 3.0,
      frequencia: "20",
    },
  ];
  return (
    <section className={Style.containerBody}>
    <section className={Style.bodyCard}>
      <section className={Style.containerAluno}>
        {alunos.map((aluno, key) => {
          return (
            <section className={Style.cardAluno} key={key}>
              <div className={Style.alunoNome}>
                <p>{aluno.nome}</p>
              </div>
              <div className={Style.alunoMatricula}>
                <p className={Style.info}>{aluno.matricula}</p>
              </div>
              <div className={Style.alunoNota}>
                <p className={Style.info}>
                  <span
                    className={
                      aluno.media > 7 ? Style.aprovado : Style.reprovado
                    }
                  >
                    {aluno.media}
                  </span>
                </p>
              </div>
              <div className={Style.alunoFrequencia}>
                <p className={Style.info}>
                  <span className={parseInt(aluno.frequencia) > 25 ? Style.aprovado : Style.reprovado}>{aluno.frequencia} %</span>
                </p>
              </div>
            </section>
          );
        })}
      </section>
      </section>
      </section>
  );
};

export default index;
