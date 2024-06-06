import MovieStars from "components/MovieStars";
import './styles.css';

function MovieScore() {

    const score = 3.5;
    const count = 14;

    return (
        <div className="mtmovie-score-container">
            <p className="mtmovie-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
            <MovieStars />
            <p className="mtmovie-score-count">{count} avaliações</p>
        </div>

    );
}
export default MovieScore;