import "../Stylesheets/mystyle.css";

function CalculateScore(props) {

  const score = (props.Total / props.Goal).toFixed(2);

  return (
    <div className="container">
      <h2>Student Management Portal</h2>

      <p><strong>Name:</strong> {props.Name}</p>
      <p><strong>School:</strong> {props.School}</p>
      <p><strong>Total Marks:</strong> {props.Total}</p>
      

      <h3> Score : {score}%</h3>
    </div>
  );
}

export default CalculateScore;