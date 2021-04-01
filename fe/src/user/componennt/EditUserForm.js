import React, { useState, useEffect, useCallback } from "react";
import axios from 'axios';
import { Link } from "react-router-dom";

const EditUserFrom = ({history}) => {
    console.log("EditUserFrom props:",JSON.stringify(history) )
    const initialuser = {no: null,  name: '', id: '', password: '', email: '', age: '',birthday: '', gender: '', phone:''};
    const [user, setUser] = useState(initialuser);


    const {
        no,
        name,
        id,
        password,
        age,
        email,
        birthday,
        gender,
        phone} = user;

 


    const updateUser = () =>{
        axios.get(`http://localhost:8080/users/${localStorage.getItem('no')}`)
        .then(res =>{
            console.log("받아오기!",res)
            setUser({
                ...user,
                no: res.data.no,
                name: res.data.name,
                id:  res.data.id,
                password: res.data.password,
                email: res.data.email,
                age: res.data.age,
                birthday:  res.data.birthday,
                gender:  res.data.gender,
                phone:  res.data.phone,
            })
        })
        .catch(err =>{
            alert(err)
        })
    };
    useEffect(() =>{
        updateUser()
    }, [])


    const handleChange = useCallback( e => {
        const {name, value} = e.target;
        setUser({...user, [name] : value});
        // == setSaleItem(saleItems.concat(salesItem))
    },[user]);  

    const handleSubmit = useCallback( e => {
        e.preventDefault();
        if(user.name || user.id  || user.password || user.email ||  user.age  ||  user.birthday  ||  user.gender  ||  user.phone) {
                axios.put(`http://localhost:8080/users/${localStorage.getItem('no')}`,{
                        no,
                        name, 
                        id,
                        password,  
                        email,
                        age,
                        birthday,
                        gender,
                        phone,
                })
                .then(res =>{
                    alert("변경해서 저장하기!",res)
                    window.location ='/ShowAllUser'
                })
                .catch(err =>{
                    console.log("업데이트중 오류발생")
                    alert(err)
                })
        
            }
    },[
        
        name, 
        id,
        password,  
        email,
        age,
        birthday,
        gender,
        phone,])
        
        

        

    
    

   
   
 

    return (<> 
    <form >
            <label>name</label>
            <input className="u-full-width" type="text" name="name" value={user.name || ""} onChange={handleChange} />
            <label>id</label>
            <input className="u-full-width" type="text" name="id" value={user.id || ""} onChange={handleChange} />
            <label>password</label>
            <input className="u-full-width" type="text" name="password" value={user.password || ""} onChange={handleChange} />
            <label>email</label>
            <input className="u-full-width" type="text" name="email" value={user.email || ""} onChange={handleChange}/>
            <label>age</label>
            <input className="u-full-width" type="text" name="age" value={user.age || ""} onChange={handleChange}/>
            <label>birthday</label>
            <input className="u-full-width" type="text" name="birthday" value={user.birthday || ""} onChange={handleChange}/>
            <label>gender</label>
            <input className="u-full-width" type="text" name="gender" value={user.gender || ""} onChange={handleChange}/>
            <label>phone</label>
            <input className="u-full-width" type="text" name="phone" value={user.phone || ""} onChange={handleChange}/>

            <button className="button-primary" type="submit" onClick={handleSubmit}>Edit item</button>
            <Link to={`/ShowAllUser`}><button className="button-primary">Cancel</button> </Link>
            
        </form>
        
    </>);
}
export default EditUserFrom;