import React from 'react'
import axios from 'axios'
const App =()=> {
  const test =e=>{
      e.preventDefault()
      alert('테스트')
      axios.post(`http://localhost:8080/users/join`,
      {
        "userNo": "1",
        "name" : "해솔",
        "username": "ssol",
        "password": "1234",
        "email" : "age",
        "age": "21",
        "birthday":"20120202",
        "gender": "M",
        "regdate" : "20210202",
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