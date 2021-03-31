
 import React from 'react'
 import {Link, Route} from 'react-router-dom'
import EditUser from './user/componennt/EditUser'
import JoinUser from './user/componennt/JoinUser'
 import ShowAllUser from "./user/componennt/ShowAllUser"
 
 const App =() =>{
     
     return(
         <>
         <Route path="/ShowAllUser" component={ShowAllUser}></Route>
         <Route path="/EditUser/:id" component={EditUser}></Route>
         <Route path="/`JoinUser" component={JoinUser}></Route>
         <Route path="/EditUser/:id" component={}></Route>
         </>
     )
 }
 export default App