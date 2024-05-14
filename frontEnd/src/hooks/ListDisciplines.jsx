import axios from "axios";

const ListDiscipline = async(enrollment) =>{
    try {
        const response = await axios.get(`http://localhost:8081/api/discipline/list/disciplines?enrollment=${enrollment}`)
        return response;
    } catch (error) {
        console.log("Não foi realizado a busca do historico do aluno.");
        return error;
    }
}

export default ListDiscipline;