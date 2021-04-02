import React, { useState, useEffect, useCallback} from 'react';
import axios from 'axios';
import { Link } from "react-router-dom";

const LoginForm = (props) =>{
    console.log("logIn form 진입:",JSON.stringify(props))
    const tryLogin ={username:'',password:''}
    const [login, setLogin] = useState({tryLogin});
    const { username, password } = login

    const handleChange = useCallback( e => {
        const {name, value} = e.target;
        setLogin({...login, [name] : value});
    },[login]); 

    const inputIdPassword = () =>{
        axios
            .get(`http://localhost:8080/users/login/${localStorage.getItem('username')}/${localStorage.getItem('password')}`)
            .then((res) => {
                setLogin({
                    ...login,
                    username: res.data.username,
                    password: res.data.password
                })
            })
            .catch((err) => console.log(err));
    }
    
    const handleSubmit = useCallback(e => {
        e.preventDefault();
        if(login.username == username || login.password ==password){
        axios.put(`http://localhost:8080/users/login/${localStorage.getItem('username')}/${localStorage.getItem('password')}`,{
            username,
            password    
        })
            .then((res) => {
                alert("아이디비번 같음을 확인 완료 ",res)
                window.location ="/auth"
            })
            .catch((err) => {
            alert(err)
            console.log("아이디 비번이 같지 않음")
        })
    }
    },[
        username,
        password
    ]);

    useEffect(() => {
        inputIdPassword();
    }, []);


    return(
            <form onSubmit={handleSubmit} method="put">
                <div>
                    <label>아이디</label>
                    <input type="text" value={login.username} name="username" placeholder="ID"onChange={handleChange}/>
                    <label>비밀번호</label>
                    <input type="text" value={login.password} name="password" placeholder="Password"onChange={handleChange}/>
                </div>
               
               
                <div>
                    <input type="checkbox" id="keepLogin" name="keepLogin"/>
                    <label for="keepLogin"><span>로그인 상태 유지</span></label>

                </div>
                <button type="submit">로그인</button>
                <Link to={`/ShowAllUser`}><button>Cancel</button> </Link>
            </form >
       
    )
}
export default LoginForm