import axios from "axios";



const Authentication =  (matricula) => {
    console.log(matricula);
   
    
    try {
      
        const response = axios.post(`http://localhost:8081/api/auth`, matricula)

        return response;
    } catch (error) {

    }
}

export default Authentication