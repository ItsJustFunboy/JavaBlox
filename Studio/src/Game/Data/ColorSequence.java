package Game.Data;

public class ColorSequence {

    public ColorSequenceKeypoint[] Keypoints;

    public Color3 evaluateColor(ColorSequence cs, float time){

        if (time==0){return (cs.Keypoints[0]).color;}
        if (time==1){return (cs.Keypoints[cs.Keypoints.length]).color;}

        for (int i = 0; i<(cs.Keypoints.length - 1); i++){

            ColorSequenceKeypoint current = cs.Keypoints[i];
            ColorSequenceKeypoint next = cs.Keypoints[i++];

            if (time >= current.time && time < next.time){

                double alpha = (time- current.time) / (next.time - current.time);

                return Color3.Color3New((next.color.fR - current.color.fR)*alpha + current.color.fR,
                        (next.color.fR - current.color.fR)*alpha + current.color.fR,
                        (next.color.fR - current.color.fR)*alpha + current.color.fR);

            }
        }

        return null;
    }


}

/*
function evalCS(cs, time)
	-- If we are at 0 or 1, return the first or last value respectively
	if time == 0 then return cs.Keypoints[1].Value end
	if time == 1 then return cs.Keypoints[#cs.Keypoints].Value end
	-- Step through each sequential pair of keypoints and see if alpha
	-- lies between the points' time values.
	for i = 1, #cs.Keypoints - 1 do
		local this = cs.Keypoints[i]
		local next = cs.Keypoints[i + 1]
		if time >= this.Time and time < next.Time then
	///////Calculate how far alpha lies between the points
			local alpha = (time - this.Time) / (next.Time - this.Time)
			-- Evaluate the real value between the points using alpha
			return Color3.new(
				(next.Value.R - this.Value.R) * alpha + this.Value.R,
				(next.Value.G - this.Value.G) * alpha + this.Value.G,
				(next.Value.B - this.Value.B) * alpha + this.Value.B
			)
		end
	end
end*/