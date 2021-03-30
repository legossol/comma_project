import React,{useState,useEffect} from "react";
import axios from 'axios';

const EditUser = () =>{
    const [users, setUsers] = useState([])
    const edit = e =>{
        axios.put(`http://localhost:8080/users/`,{
            name:"",
            id:null,
            password:"",
            age:"",
            email:"",
            birthday:null,
            gender:"",
            phone:""
            })
        .then(res =>{
            console.log(res.data)
            alert('데이터수정성공')
            setUsers(res.data);
        })
        .catch(err =>{
            console.log(err);
            alert("다시 시도해주세요");
        })
    }
    // const submit = e =>{
    //     e.preventdefault();
    //     if(users.name&&users.id&&users.password&&users.email&&users.phone){props.updateUser}
    // }
            return (
                <div>
                    <form>

                    <h2>수정 페이지</h2>
                        
                        <label>이름</label>
                        <input name="name" value={users.name} />
                        <hr/>
                        <label>아이디</label>
                        <input name="id" value={users.id} />
                        <hr/>
                        <label>비밀번호</label>
                        <input name="password" value={users.password}/>
                        <hr/>
                        <label>나이</label>
                        <input name="age" value={users.age} />
                        <hr/>
                        <label>이메일</label>
                        <input name="email" value={users.email} />
                        <hr/>
                        <label>생일</label>
                        <input name="birthday" value={users.email}/>
                        <hr/>
                        <label>성별</label>
                        <input name="gender" value={users.email}/>
                        <hr/>
                        <label>핸드폰</label>
                        <input name="phone" value={users.phone}/>
                   
                   <button onChange={edit}value="수정 완료">수정 진행</button>
                   <button value="취소">취소</button>
                   </form>
                </div>
            );
        
    };
    

export default EditUser;