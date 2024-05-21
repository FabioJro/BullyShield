import React, { useEffect, useState } from 'react'
import Style from './CardLogin.module.css'
import FindTeams from '../../hooks/FindTeams'
import Cookies from 'js-cookie'
import { useNavigate } from 'react-router-dom';

const index = () => {
    const turmas = [
        {
            nome: 'C.C - 8 N A',
            alunosCadastrados: 20,
            media: '5',
            presencaTurma: '90%',
            maiorNota: 'Gafanhoto jr',
            disciplinas: [
                {
                    Disciplina: "Lógica de Programação",
                    Media: 7.5,
                    Frequencia: "90%",
                    Acima: "30",
                    Abaixo: "20",
                    QtdAlunos: "50",
                },
                {
                    Disciplina: "Algoritmos",
                    Media: 5.0,
                    Frequencia: "80%",
                    Acima: "25",
                    Abaixo: "35",
                    QtdAlunos: "60",
                },
                {
                    Disciplina: "Estrutura de Dados",
                    Media: 6.0,
                    Frequencia: "85%",
                    Acima: "40",
                    Abaixo: "20",
                    QtdAlunos: "45",
                },
            ],
        },
        {
            nome: 'C.C - 5 N M',
            alunosCadastrados: 15,
            media: '6.5',
            presencaTurma: '92%',
            maiorNota: 'João da Silva',
            disciplinas: [
                {
                    Disciplina: "Programação Orientada a Objetos",
                    Media: 8.0,
                    Frequencia: "95%",
                    Acima: "50",
                    Abaixo: "30",
                    QtdAlunos: "80",
                },
                {
                    Disciplina: "Banco de Dados",
                    Media: 7.5,
                    Frequencia: "90%",
                    Acima: "40",
                    Abaixo: "20",
                    QtdAlunos: "70",
                },
                {
                    Disciplina: "Redes de Computadores",
                    Media: 7.0,
                    Frequencia: "88%",
                    Acima: "35",
                    Abaixo: "25",
                    QtdAlunos: "75",
                },
            ],
        },
        {
            nome: 'C.C - 2 N A',
            alunosCadastrados: 27,
            media: '7.2',
            presencaTurma: '95%',
            maiorNota: 'Maria Oliveira',
            disciplinas: [
                {
                    Disciplina: "Inteligência Artificial",
                    Media: 8.5,
                    Frequencia: "92%",
                    Acima: "45",
                    Abaixo: "15",
                    QtdAlunos: "70",
                },
                {
                    Disciplina: "Sistemas Operacionais",
                    Media: 7.0,
                    Frequencia: "87%",
                    Acima: "35",
                    Abaixo: "20",
                    QtdAlunos: "60",
                },
                {
                    Disciplina: "Engenharia de Software",
                    Media: 7.8,
                    Frequencia: "90%",
                    Acima: "40",
                    Abaixo: "25",
                    QtdAlunos: "65",
                },
            ],
        },
        {
            nome: 'C.C - 3 N A',
            alunosCadastrados: 20,
            media: '6.0',
            presencaTurma: '88%',
            maiorNota: 'José Silva',
            disciplinas: [
                {
                    Disciplina: "Web Development",
                    Media: 7.2,
                    Frequencia: "85%",
                    Acima: "30",
                    Abaixo: "20",
                    QtdAlunos: "50",
                },
                {
                    Disciplina: "Machine Learning",
                    Media: 6.5,
                    Frequencia: "82%",
                    Acima: "25",
                    Abaixo: "20",
                    QtdAlunos: "40",
                },
                {
                    Disciplina: "Segurança da Informação",
                    Media: 6.0,
                    Frequencia: "80%",
                    Acima: "20",
                    Abaixo: "30",
                    QtdAlunos: "45",
                },
            ],
        }
    ];
    const navigate = useNavigate()
    const [inputValue, setInputValue] = useState('');
    const [turmaList, setTurmaList] = useState(turmas);

    // useEffect(() => {
    //     const user = Cookies.get('user');
    //     const getTurma = async (user) => {
    //         const turmaResponse = await FindTeams(user);
    //         setTurmaList(turmaResponse);
    //     };
    //     getTurma(user);
    // }, []);

    const handleInputChange = (e) => {
        setInputValue(e.target.value);
        e.preventDefault();
        // Filtrar as turmas com base no valor do input
        const filteredTurmas = turmas.filter((turma) =>
            turma.nome.toLowerCase().includes(e.target.value.toLowerCase())
        );
        setTurmaList(filteredTurmas);
    };


    const submitCard = (turma) => {
        const turmaString = JSON.stringify(turma);
        localStorage.setItem('turma', turmaString);
        navigate('/turma')
    };

    return (
        <section className={Style.body}>
            <section className={Style.sectionCard}>
                <input
                    className={Style.inputFindTurma}
                    type="text"
                    placeholder='Encontre a turma'
                    value={inputValue}
                    onChange={handleInputChange}
                />
                <section className={Style.bodyCard}>
                    {turmaList.map((turma, index) => (
                        <div className={`${Style.card} ${turma.media < 6 ? Style.redBorder : turma.media >= 5 && turma.media <= 7 ? Style.yellowBorder : ''}`} key={index} onClick={() => { submitCard(turma); }}>
                        <div className={Style.bodyCardTurma}>
                            <section className={Style.detailsCardTurma}>
                                <p>Media: {turma.media}</p>
                                <p>Frequencia: {turma.presencaTurma}</p>
                                <p>Alunos cadastrados: {turma.alunosCadastrados}</p>
                                {/* <p>maior nota da turma: {turma.maiorNota}</p> */}
                            </section>
                        </div>
                        <div className={Style.footerCard}><p className={Style.tilteCard}>{turma.nome}</p></div>
                    </div>
                    
                    ))}
                </section>
            </section>
        </section>
    );
};

export default index