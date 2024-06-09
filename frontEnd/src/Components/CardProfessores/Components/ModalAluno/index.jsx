import React from "react";
import Style from "./ModalAluno.module.css";
const index = ({id, onClose}) => {
  const historico = [
    {
      nome: "Fabio",
      matricula: 123341,
      disciplinas: [
        {
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },
        {
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },
        {
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },

        {
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        }, {
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },
        {
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },
        {
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },
        {
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },
        {
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },
        {
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },
        {
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },
        {
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },
        {
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },
        {
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },
        {
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },
        {
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },
        {
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },
        {
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },
        {
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },{
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },{
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },{
          nomeDisciplina: "Matematica",
          mediaNotaDisciplina: "2.5",
          frequenciaMediaDisciplina: "90",
         
        },


      ],
    },
  ];
  return (
    <section className={Style.bodyPage}>
      <button className={Style.fecharModal} onClick={onClose}>x</button>
      <section className={Style.bodyHistorico}>
        {historico.map((card, key) => {
          return (
            <div className={Style.modal} key={key}>
              <div className={Style.modalHistorico}>
                <h2 className={Style.historico}>Historico do Aluno</h2>
              </div>
              <div className={Style.infoAluno}>
                <div className={Style.modalNome}>
                  <div className={Style.nome}>
                    <p>
                        {id.nome}
                    </p>
                  </div>
                  <div div className={Style.matricula}>
                    <p>Matricula : {id.matricula}</p>
                  </div>
                </div>
              </div>
              <div className={Style.info}>
                <div className={Style.modalInfo}>
                  <div div className={Style.matricula}>
                    <p>Disciplina</p>
                  </div>
                  <div div className={Style.media}>
                    <p>Nota Media</p>
                  </div>
                  <div div className={Style.frequencia}>
                    <p>Frequencia</p>
                  </div>
                </div>
              </div>
              <div className={Style.modalDisciplina}>
                <p>
                  {id && id.disciplinas.map((disciplina, key) => {
                    return (
                      <div className={Style.modalAluno}>
                        <div div className={Style.modalNomeDisciplina}>
                          <p>{disciplina.nome}</p>
                        </div>
                        <div div className={Style.modalmediaNotaDisciplina}>
                          <p>{disciplina.media}</p>
                        </div>
                        <div className={Style.modalfrequenciaMediaDisciplina}>
                          <p>{disciplina.frequencia}</p>
                        </div>
                      </div>
                    );
                  })}
                </p>
              </div>
            </div>
          );
        })}
      </section>
    </section>
  );
};

export default index;
