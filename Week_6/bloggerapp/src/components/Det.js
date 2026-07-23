function Det(props){

const bookdet=(

<ul>

{

props.books.map((book)=>(

<div key={book.id}>

<h3>{book.bname}</h3>

<h4>{book.price}</h4>

</div>

))

}

</ul>

);

const blogdet=(

<ul>

{

props.blogs.map((blog)=>(

<div key={blog.id}>

<h2>{blog.title}</h2>

<h4>{blog.author}</h4>

<p>{blog.content}</p>

</div>

))

}

</ul>

);

const coursedet=(

<ul>

{

props.courses.map((course)=>(

<div key={course.id}>

<h2>{course.cname}</h2>

<h4>{course.date}</h4>

</div>

))

}

</ul>

);

return(

<div className="container">

<div className="box">

<h1>Course Details</h1>

{coursedet}

</div>

<div className="box">

<h1>Book Details</h1>

{bookdet}

</div>

<div className="box">

<h1>Blog Details</h1>

{blogdet}

</div>

</div>

);

}

export default Det;