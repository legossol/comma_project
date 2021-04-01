import React, {useRef, useState,useCallback, useEffect} from 'react';
import axios from 'axios';
import { Link } from "react-router-dom";

const LoginForm = () =>{
    console.log("logIn form 진입:",JSON.stringify())
    
    return(
            <form>
                <div>
                    <label for="loginId">아이디</label>
                    <input type="text" id="loginId" name="userID" placeholder="ID"/>
                    <label for="userID">비밀번호</label>
                    <input type="text" id="loginPw" name="password" placeholder="Password"/>
                </div>
               
               
                <div>
                    <input type="checkbox" id="keepLogin" name="keepLogin"/>
                    <label for="keepLogin"><span>로그인 상태 유지</span></label>

                </div>
                <button type="submit">로그인</button>
                <Link to={`/ShowAllUser`}><button className="button-primary">Cancel</button> </Link>
            </form>
       
    )
}
export default LoginForm