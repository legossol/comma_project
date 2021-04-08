import React from 'react'
import axios from 'axios'

const BoardCreateForm = (props) =>{
    console.log("boardcreateForm 진입",JSON.stringify(props))
    const []
    return(
        <>
            <form>
                <label>Title</label>
                <input type="text" name ="title" value={title} onChange={}/>
                <label>Writer</label>
                <input type="text" name ="Writer" value={Writer} onChange={}/>
                <label>Content</label>
                <input type="text" name ="Content" value={Content} onChange={}/>
                

            </form>
        </>
    )
}
export default BoardCreateForm