import React, { useState, useEffect} from 'react';
import axios from 'axios';
import { Link } from "react-router-dom";

const LoginForm = () =>{
    console.log("logIn form 진입:",JSON.stringify())
    const [login, setLogin] = useState([]);
    const { username, password } = login

    const fetchUser = () => {
        axios.get(`http://localhost:8080/users/list`)
            .then((res) => {
                console.log("유저들의 정보를 불러왔습니다",res.data);
                setLogin(res.data);
            })
            .catch((err) => console.log(err));
    };

    useEffect(() => {
        fetchUser();
    }, []);

    const handleChange = (e) => {
        const { value, name } = e.target;
        setLogin({
            ...login,
            [name]: value,
        });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        axios
            .post(`http://localhost:8080/users/login`, { ...login })
            .then((res) => {
                console.log(res);
            })
            .catch((err) => console.log(err));
    };

    
    return(
            <form onSubmit={handleSubmit} method="post">
                <div>
                    <label>아이디</label>
                    <input type="text" value={username} id="loginId" name="username" placeholder="ID"onChange={handleChange}/>
                    <label>비밀번호</label>
                    <input type="text" value={password} id="loginPw" name="password" placeholder="Password"onChange={handleChange}/>
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