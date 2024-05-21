import React, { useState } from "react";
import Style from "./RelatorioAluno.module.css";

const index = () => {
  const [alunos, setAlunos] = useState([
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
  ]);

  const [filtroTexto, setFiltroTexto] = useState("");
  const [filtroMedia, setFiltroMedia] = useState("todos");

  const handleFilter = (e) => {
    setFiltroTexto(e.target.value);
  };
  const handleFilterMedia = (e) => {
    setFiltroMedia(e.target.value);
  };
  const filterName = alunos.filter((aluno) => {
    const nomeMatch = aluno.nome
      .toLowerCase()
      .includes(filtroTexto.toLowerCase());
    if (filtroMedia === "maiorMedia") {
      return nomeMatch && aluno.media >= 7;
    } else if (filtroMedia === "menorMedia") {
      return nomeMatch && aluno.media < 7;
    } else {
      return nomeMatch;
    }
  });

  return (
    <section className={Style.containerBody}>
      {/* <div className={Style.bodyInfo}>
        <h1>Media geral</h1>
        <h1>Frequencia geral</h1>
      </div> */}
      <section className={Style.bodyCard}>
        <div className={Style.containerSearch}>
          <div className={Style.input}>
            <input
              className={Style.inputFindTurma}
              type="text"
              placeholder="Buscar Aluno"
              value={filtroTexto}
              onChange={handleFilter}
            />
          </div>
          <div className={Style.teste}>
          <select className={Style.selectMedia} value={filtroMedia} onChange={handleFilterMedia}>
              <option value="maiorMedia">Aluno</option>
              <option value="maiorMedia">Maior Media</option>
              <option value="menorMedia">Menor Media</option>
            </select>
          </div>
        </div>
        <section className={Style.containerAluno}>
          {filterName.map((aluno, index) => {
            return (
              <section className={Style.cardAluno} key={index}>
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
                    <span
                      className={
                        parseInt(aluno.frequencia) > 25
                          ? Style.aprovado
                          : Style.reprovado
                      }
                    >
                      {aluno.frequencia} %
                    </span>
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
