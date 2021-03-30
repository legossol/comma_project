import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import {BrowserRouter} from 'react-router-dom'
import ShowAllUser from './user/componennt/ShowAllUser'
import JoinUser from './user/componennt/JoinUser';
import EditUser from './user/componennt/EditUser';
import CheckDup from './user/componennt/CheckDup';
ReactDOM.render(
  <React.StrictMode>
    <BrowserRouter>
    <ShowAllUser/>
      <EditUser/>
      <CheckDup/>
    </BrowserRouter>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
