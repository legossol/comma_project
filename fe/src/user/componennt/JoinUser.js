import React, {useState}  from 'react';
import axios from 'axios';
import { Link } from "react-router-dom";

const JoinUser = () =>{
    const [name, setName] = useState('');
    const [id, setID] =useState('');
    const [password, setPassword] =useState('');
    const [email, setEmail] =useState('');
    const [age, setAge] =useState('');
    const [birthday, setBirthday] =useState('');
    const [gender, setGender] =useState('');
    const [date, setDate] =useState('');
    const [phone, setPhone] =useState('');

    const onChangeName = e =>{
        setName(e.target.value);
    }
    const onChangeid = e =>{
        setID(e.target.value);
    }
    const onChangePassword = e =>{
        setPassword(e.target.value);
    }
    const onChangeEmail = e =>{
        setEmail(e.target.value);
    }
    const onChangeAge = e =>{
        setAge(e.target.value);
    }
    const onChangeBirthday = e =>{
        setBirthday(e.target.value);
    }
    const onChangeGender = e =>{
        setGender(e.target.value);
    }
    const onChangeDate = e =>{
        setDate(e.target.value);
    }
    const onChangePhone = e =>{
        setPhone(e.target.value);
    }
    const add = e => {
        axios.post(`http://localhost:8080/users/join`,{
            name,
            id,
            password,
            age,
            email,
            birthday,
            gender,
            date,
            phone
        })
        .then( res => {
          console.log(res)
          alert(`테스트 성공: ${JSON.stringify(res)}`)
        })
        .catch(err => {
          alert(`다시 시도 해주세요 : ${err}`)
        })
      }
    return(
<form>
    <div>
        <h2>회원 등록</h2>
        <table>
            <thead>
            <tr>
                <th>이름</th>
                <th>아이디</th>
                <th>비밀번호</th>
                <th>이메일</th>
                <th>나이</th>
                <th>생일</th>
                <th>성별</th>
                <th>핸드폰번호</th>
            </tr>
            </thead>
            <tbody>
                <tr>
                    <td><input type="text" value={name} onChange={onChangeName}/></td>
                    <td><input type="text" value={id} onChange={onChangeid}/></td>
                    <td><input type="text" value={password} onChange={onChangePassword}/></td>
                    <td><input type="text" value={email} onChange={onChangeEmail}/></td>
                    <td><input type="text" value={age} onChange={onChangeAge}/></td>
                    <td><input type="text" value={birthday} onChange={onChangeBirthday}/></td>
                    <td><input type="text" value={gender} onChange={onChangeGender}/></td>
                    <td><input type="text" value={phone} onChange={onChangePhone}/></td>
                </tr>
            </tbody>
        </table>
        <button onClick={add}>회원 등록</button>
    </div>
</form>
    )
}

export default JoinUser;