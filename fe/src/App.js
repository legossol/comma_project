import React from 'react'
import {Link, Route} from 'react-router-dom'
import './App.css'
import EditUser from './user/componennt/EditUser'
import JoinUser from './user/componennt/JoinUser'
import ReadUser from './user/componennt/ReadUser'
import ShowAllUser from './user/componennt/ShowAllUser'
import ShowAllUserForm from './user/componennt/ShowAllUserForm'

const App = () =>{
    return(
        <>
        <Link to={`/ShowAllUser`}><button>List</button></Link>
        <Route path="/ShowAllUser" component={ShowAllUser}/>
        <Route path="/ShowAllUserForm" component={ShowAllUserForm}/>
        <Route path="/ReadUser" component={ReadUser}/>
        <Route path="/JoinUser" component={JoinUser}/>
        <Route path="/EditUser" component={EditUser}/>
        
        </>
    )
}

export default App
