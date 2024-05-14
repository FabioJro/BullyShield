import axios from "axios";



const Authentication =  (matricula) => {
    console.log(matricula);
   
    
    try {
      
        const response = axios.post(`http://185.137.92.83:8081/api/auth`, matricula)

        return response;
    } catch (error) {

    }
}

export default Authentication