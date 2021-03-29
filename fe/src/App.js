import React from 'react'
import axios from 'axios'
const App =()=> {
  const test =e=>{
      e.preventDefault()
      alert('테스트')
      axios.post(`http://localhost:8080/users/join`,
      {
        "name" : "ssol",
        "id": "ssol",
        "password": "1234",
        "email" : "wkdogthf@gmail.com",
        "age": "21",
        "birthday":"20120202",
        "gender": "M",
        "phone": "01049494838"
      })
        .then(res=>{
          alert(`테스트 성공: ${JSON.stringify(res)}`)
        })
        .catch(err=>{
          alert(`다시 시도 해주세요 : ${err}`)
        })
  }
  return (
    <div><h1>테스트</h1><button onClick={test}>등록</button></div>
  )
}
export default App;