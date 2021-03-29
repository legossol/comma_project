import React, { useState, useEffect } from "react";
import axios from 'axios'

const ShowAllUser = () =>{
    const [users, setUsers] = useState([])
    const fetchList = () => {
        axios
            .get("http://localhost:8080/users/list")
            .then((res) => {
                console.log("모든 유저 들어옴");
                setUsers(res.data);
            })
            .catch((err) => console.log(err));
    };
    useEffect(() => {
        fetchList();
    }, []);
    const deleteUser = (e) =>{
        e.preventDefault();
        axios.delete('http://localhost:8080/users/list')
        .then(res=>{
            console.log(res.data);
            this.setState({deleteMsg: "삭제성공"})
        })
        .catch((err)=>{
            console.log(err);
        })
    }
   return users.map((user) => {
        return (
            <table>
                <thead>
                    <tr>
                        <th>No</th>
                        <th>이름</th>
                        <th>아이디</th>
                        <th>비밀번호</th>
                        <th>이메일</th>
                        <th>나이</th>
                        <th>생일</th>
                        <th>성별</th>
                        <th>등록날짜</th>
                        <th>핸드폰번호</th>
                    </tr>
                </thead>
                
                <tbody>
                    <tr>
                        <td>{user.no}</td>
                        <td>{user.name}</td>
                        <td>{user.id}</td>
                        <td>{user.password}</td>
                        <td>{user.email}</td>
                        <td>{user.age}</td>
                        <td>{user.birthday}</td>
                        <td>{user.gender}</td>
                        <td>{user.date}</td>
                        <td>{user.phone}</td>
                    </tr>
                </tbody>
                <tfoot>
                    <button>수 정</button>
                    <button onClick={deleteUser}>삭 제</button>
                </tfoot>
            </table>
        );
    });
};

export default ShowAllUser;