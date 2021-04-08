import BoardCreateForm from "./BoardCreateForm"

const BoardCreate = () =>{
    console.log("boardcreate 진입: ",JSON.stringify())

    return(
        <>
        <h2>board create</h2>
        <BoardCreateForm></BoardCreateForm>
        </>
    )
}
export default BoardCreate