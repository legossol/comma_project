import React, {useState, useEffect, useCallback}from "react";
import axios from 'axios';
import { Link } from "react-router-dom";

const EditUserFrom = (props) =>{
    console.log("유저 수정페이지 들어옴 : ",JSON.stringify(props))

    const [user, setUser] = useState({});

    const{
        name,
        id,  
        password,
        age,
        email,
        birthday,
        gender,
        phone
    } = user;

    const updateUser = () =>{
        axios.put(`http://localhost:8080/users/${localStorage.getItem('no')}`)
        .then(res=>{
            console.log("updatedUser",res)
            setUser({
                name: res.data.name,
                id: res.data.id,  
                password: res.data.password,
                age: res.data.age,
                email: res.data.email,
                birthday: res.data.birthday,
                gender: res.data.gender,
                phone: res.data.phone
            })
        })
        .catch(err =>{
            alert(err)
        })
    };
    useEffect(()=>{
        updateUser()
    })
    const handleChange = useCallback( e => {
        const {name, value} = e.target;
        setUser({...user, [name] : value});
    },[user]); 
    const handleSubmit = useCallback(e=>{
        e.preventDefault();
        if(user.name || user.id || user.password || user.age || user.email || user.birthday || user.gender || user.phone){
            axios.post(`http://localhost:8080/users/${localStorage.getItem('no')}`,{
                name,
                id,  
                password,
                age,
                email,
                birthday,
                gender,
                phone
            })
            .then(res =>{
                alert("변경해서 저장하기!",res)
                window.location ='/ItemBoard'
            })
            .catch(err =>{
                alert(err)
            })

        }
    },[
        name,
            id,  
            password,
            age,
            email,
            birthday,
            gender,
            phone
    ])

    return(
        <form onSubmit={handleSubmit}method="post">
            <label>name</label>
            <input type="text" name="name" value={user.name} onChange ={handleChange}/>
            <label>아이디</label>
             <input type="text"name="id" value={user.id} onChange ={handleChange}/>
             <hr/>
             <label>비밀번호</label>
             <input type="text"name="password" value={user.password}onChange ={handleChange}/>
             <hr/>
             <label>나이</label>
             <input type="text"name="age" value={user.age}onChange ={handleChange} />
             <hr/>
             <label>이메일</label>
             <input type="text"name="email" value={user.email} onChange ={handleChange}/>
             <hr/>
             <label>생일</label>
             <input type="text"name="birthday" value={user.birthday}onChange ={handleChange}/>
             <hr/>
             <label>성별</label>
             <input type="text"name="gender" value={user.gender}onChange ={handleChange}/>
             <hr/>
             <label>핸드폰</label>
             <input type="text"name="phone" value={user.phone}onChange ={handleChange}/>
        
            <button type="submit">수정</button>
            <button type="submit" onClick={'/list'}>Cancel</button>
        </form>
    );
}

export default EditUserFrom;