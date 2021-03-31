
 import React from 'react'
 import {Route} from 'react-router-dom'
import EditUser from './user/componennt/EditUser'
import JoinUser from './user/componennt/JoinUser'
 import ShowAllUser from "./user/componennt/ShowAllUser"
 
 const App =() =>{
     
     return(
         <>
         <Route path="/users/list" component={ShowAllUser}/>
         <Route path="/users/:id" component={EditUser}/>
         <Route path="/`JoinUser" component={JoinUser}/>
         </>
     )
 }
 export default App