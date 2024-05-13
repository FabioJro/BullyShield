import React from "react";
import Style from "./About.module.css";

const index = () => {
  return (
    <section className={Style.bodyGeral}>
      <section className={Style.sectionCard}>
        <p>
          O BullyShield tem como objetivo desenvolver uma plataforma web a qual
          irá ser destinada a IES , buscando prevenir e identificar casos de
          cyberbullying com seus alunos. Com a ajuda do professor sendo um
          mediador na plataforma, analisando os dados dos alunos e seus
          precedentes e assim identificar um possível .
        </p>
        <p>
          Devido aos crescentes casos de cyberbullying no país, o Brasil é o
          segundo país no ranking mundial de cyberbullying, onde 21% das pessoas
          afirmam ter sofrido o crime.  A criação deste projeto visa alinhar as
          ações da IES (Instituição de Ensino Superior) às ações no âmbito
          nacional com medidas adotadas para prevenir, punir os casos de
          bullying e cyberbullying.Os benefícios propostos pelo bullyshield, são
          evitar casos graves e reduzir a escala dos casos de bullying e
          cyberbullying, além de tornar eficiente a identificação dos possíveis
          casos.
        </p>
      </section>
    </section>
  );
};

export default index;
