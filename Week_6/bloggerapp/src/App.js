import Det from "./components/Det";

import {books,blogs,courses} from "./data";

function App(){

return(

<Det

books={books}

blogs={blogs}

courses={courses}

/>

);

}

export default App;