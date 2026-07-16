import logo from './logo.svg';
import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
     <div>
      <CalculateScore
        Name="Akshat Jaiswal"
        School="XYZ University"
        Total={450}
        Goal={5}
      />
    </div>
  );
}

export default App;
