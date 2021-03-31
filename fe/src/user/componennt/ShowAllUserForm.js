import React, { useState, useEffect,useCallback } from "react";
import { Link } from "react-router-dom";
const ShowAllUserForm =(props) =>{
    console.log("ShowAllUserForm props:",JSON.stringify(props) )
  console.log("ShowAllUserForm locationObject:",JSON.stringify(props) )
return(
    <>
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
                {props.saleItems.length > 0 ? (
                        props.saleItems.map(saleItem => {
                            const {itemNo,hashTag, itemPicture, title, writer, regDate, soldOut} = saleItem;
                            return(
                            <tr key={itemNo}>
                            <td>{itemNo}</td>
                            <td>{hashTag}</td>
                            <td>{itemPicture}</td>
                            <td>{title}</td>
                            <td>{writer}</td>
                            <td>{regDate}</td>
                            <td>{soldOut}</td>
                            <td>
                              <Link to={`/ItemRead/${itemNo}`} className="linkto-salesItem">
                              <button onClick={() => {
                                        localStorage.setItem('itemNo',`${itemNo}`)
                                    }}>자세히보기</button>
                              </Link>
                            </td>
                        </tr>
        )
      })
      ) : (
          <tr>
              <td colSpan={9}>No Items Found</td>
          </tr>
          )
      }
                </tbody>
                <tr>
                    <td>
                    <Link to={`/ItemAdd`} >
                    <button className="button-primary">등록하기</button></Link>
                    </td>
                </tr>
            </table>
  </>)
};
export default ShowAllUserForm