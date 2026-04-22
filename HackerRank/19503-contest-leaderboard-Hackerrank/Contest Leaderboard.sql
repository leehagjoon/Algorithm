SELECT 
    h.hacker_id, 
    h.name, 
    t.total_score
FROM Hackers h
JOIN (
  -- 총점 계산 서브쿼리
    SELECT 
        hacker_id, 
        SUM(max_score) as total_score
    FROM (
  -- 각 챌린지별 최고점 찾기 서브쿼리
        SELECT hacker_id, 
        challenge_id, 
        MAX(score) as max_score
        FROM Submissions
        GROUP BY hacker_id, challenge_id
    ) as MaxScores
    GROUP BY hacker_id
) as t ON h.hacker_id = t.hacker_id
WHERE t.total_score > 0
ORDER BY t.total_score DESC, h.hacker_id ASC;
