import React from 'react'
import Style from './CardLogin.module.css'

const index = () => {
    const turma = [
        {
            title: 'Alunos cadastrados: 60',
            media: 'Média notas: 7,5',
            frequencia: 'Presença da turma: 90%',
            disciplinas: 5,
            maiorNota: 'Gafanhoto jr',

        },
        {
            title: 'Alunos cadastrados: 60',
            media: 'Média notas: 7,5',
            frequencia: 'Presença da turma: 90%',
            disciplinas: 5,
            maiorNota: 'Gafanhoto jr',

        },
        {
            title: 'Alunos cadastrados: 60',
            media: 'Média notas: 7,5',
            frequencia: 'Presença da turma: 90%',
            disciplinas: 5,
            maiorNota: 'Gafanhoto jr',

        },
        {
            title: 'Alunos cadastrados: 60',
            media: 'Média notas: 7,5',
            frequencia: 'Presença da turma: 90%',
            disciplinas: 5,
            maiorNota: 'Gafanhoto jr',

        },
        {
            title: 'Alunos cadastrados: 60',
            media: 'Média notas: 7,5',
            frequencia: 'Presença da turma: 90%',
            disciplinas: 5,
            maiorNota: 'Gafanhoto jr',

        },
        {
            title: 'Alunos cadastrados: 60',
            media: 'Média notas: 7,5',
            frequencia: 'Presença da turma: 90%',
            disciplinas: 5,
            maiorNota: 'Gafanhoto jr',

        },
    ]
    const findTurma = (e)=>{
        e.target.value
    }
    return (
        <section className={Style.body}>
            <section className={Style.sectionCard}>
                <input className={Style.inputFindTurma} 
                type="text" 
                placeholder='Encontre a turma'
                onChange={findTurma}
                 />
                <section className={Style.bodyCard}>
                    {turma.map((card, key) => {
                        return (
                            <div className={Style.card} key={key}>
                                <div className={Style.bodyCardTurma}>
                                    <h3 className={Style.tilteCardTurma}>{card.title}</h3>
                                    <section className={Style.detailsCardTurma}>
                                        <p>{card.media}</p>
                                        <p>{card.frequencia}</p>
                                        <p>Disciplinas: {card.disciplinas}</p>
                                        <p>maiores numeros: {card.maiorNota}</p>
                                    </section>
                                </div>
                                <div className={Style.footerCard}><p className={Style.tilteCard}>C.C - 7NA</p></div>
                            </div>
                        );
                    })}

                </section>
            </section>
        </section>
    )
}

export default index