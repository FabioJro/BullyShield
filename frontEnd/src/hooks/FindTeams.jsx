import axios from "axios";

const FindTeams = async (id)=>{
    try{
        const response = await axios.get(`http://localhost:8081/api/team/find/teams-by/${id}`)
        return response; 
    }catch(error){
        console.log("não foi realizada a busca da turma!");
        return error;
    }
}

export default FindTeams