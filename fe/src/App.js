import React from 'react'
import {Link, Route} from 'react-router-dom'
import './App.css'
import EditUser from './user/componennt/EditUser'
import JoinUser from './user/componennt/JoinUser'
import ReadUser from './user/componennt/ReadUser'
import ShowAllUser from './user/componennt/ShowAllUser'
import ShowAllUserForm from './user/componennt/ShowAllUserForm'
import Login from './user/componennt/Login'
const App = () =>{
    return(
        <>
        <Link to={`/ShowAllUser`}><button>List</button></Link>
        <Link to={`/Login`}><button>Go to LoginPage</button></Link>
        <Route path="/ShowAllUser" component={ShowAllUser}/>
        <Route path="/ShowAllUserForm" component={ShowAllUserForm}/>
        <Route path="/ReadUser/:id" component={ReadUser}/>
        <Route path="/JoinUser" component={JoinUser}/>
        <Route path="/EditUser/:id" component={EditUser}/>
        <Route path="/Login" component={Login}/>
        </>
    )
}

export default App
