import React, {useState} from 'react';
import axios from 'axios'

const list = () =>{
    const [user, setUser] = useState([])
    const fetchList = () => {
        axios
            .get("http://localhost:8080/users/list")
            .then((res) => {
                console.log("모든 유저 들어옴");
                setList(res.data);
            })
            .catch((err) => console.log(err));
    };
    useEffect(() => {
        fetchList();
    }, []);    
   return list.map((user) => {
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
                        <td>
                        <Link to="User">
                <button>작성하기</button>
                        </Link>
                        </td>
                    </tr>
                </tbody>
            </table>
        );
    });
};