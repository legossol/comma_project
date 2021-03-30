
import axios from 'axios';

const CheckDup =(props) =>{
    const check =() =>{
    axios.put(`http://localhost:8080/users/${props.match.id = 1}`,{"no":1,"name":"나는천재"})
    .then(res =>{
        console.log(res)
        alert(res.data)
    })
    .catch(err => {
      alert(err)
      console.log("실패")
    })
}
    return(
        <>
        <h2>check</h2>
        <button onClick={check}>test</button>
        </>
    )

}
export default CheckDup;