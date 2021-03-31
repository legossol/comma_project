import React, { useState, useEffect, useCallback } from "react";
import axios from 'axios'
import ApiService from '../service/ApiService'
import ShowAllUserForm from "./ShowAllUserForm";
const ShowAllUser = (props) =>{
    console.log("ShowAllUser props:",JSON.stringify(props))
    const [users, setUsers] = useState([])
    const addUser = useCallback(user =>{
        user.no = users.length+1;
        setUsers([...users,user]);
    },[users]);
    const deleteUser = useCallback(no =>
        setUsers(users.fillter(user=>user.no!==no)),[users])

    const fetchList = () => {
        axios
            .get("http://localhost:8080/users/list")
            .then((res) => {
                console.log("모든 유저 들어옴");
                setUsers(...users,res.data);
            })
            .catch((err) => console.log(err));
    }
    useEffect(() => {
        fetchList();
    }, []);
        return (
            <>
        <div className="container">
            <div>
                <h2>All user list</h2>
                <ShowAllUserForm users={users}>
                    
                </ShowAllUserForm>
            </div>
        </div>
    </>)
}
export default ShowAllUser;