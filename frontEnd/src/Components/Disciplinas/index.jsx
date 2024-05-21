import React, { useEffect, useState } from 'react';
import Style from './Disciplinas.module.css';

const Disciplinas = () => {
    const [turma, setTurma] = useState({});

    useEffect(() => {
        const turmaString = localStorage.getItem('turma');
        const turma = JSON.parse(turmaString);
        setTurma(turma);
    }, []);

    return (
        <section className={Style.container_disciplina}>
            <section className={Style.body_disciplinas}>
                <section className={Style.container_card}>
                    {turma.disciplinas && turma.disciplinas.map((disciplina, key) => (
                        <section className={Style.card_disciplina} key={key}>
                            <div className={Style.container_title}><p>{disciplina.Disciplina}</p></div>
                            <div className={Style.container_body}>
                                <div className={Style.body}>
                                    <p>Média: {disciplina.Media}</p>
                                    <p>Frequência: {disciplina.Frequencia}</p>
                                </div>
                                <div className={Style.body}>
                                    <p>Acima da média: {disciplina.Acima}</p>
                                    <p>Abaixo da média: {disciplina.Abaixo}</p>
                                    <p>Qtd. Alunos: {disciplina.QtdAlunos}</p>
                                </div>
                            </div>
                        </section>
                    ))}
                </section>
            </section>
        </section>
    );
}

export default Disciplinas;
