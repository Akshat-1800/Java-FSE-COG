import './App.css';
import officeImage from './image.png';

function App() {

  const element = "Office Space";

  const offices = [

    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: officeImage
    },

    {
      Name: "WeWork",
      Rent: 70000,
      Address: "Bangalore",
      Image: officeImage
    },

    {
      Name: "Regus",
      Rent: 55000,
      Address: "Hyderabad",
      Image: officeImage
    }

  ];

  return (

    <div className="App">

      <h1>{element}, at Affordable Range</h1>

      {

        offices.map((item,index)=>{

          let color =
            item.Rent <= 60000
            ? "textRed"
            : "textGreen";

          return(

            <div key={index} className="card">

              <img
                src={item.Image}
                width="250"
                height="220"
                alt="Office Space"
              />

              <h1>Name: {item.Name}</h1>

              <h3 className={color}>
                Rent: Rs. {item.Rent}
              </h3>

              <h3>
                Address: {item.Address}
              </h3>

            </div>

          )

        })

      }

    </div>

  );

}

export default App;