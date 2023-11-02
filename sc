local Robberys = {
	['1'] = 'bank',
	['2'] = 'Jewelry Store',
	['3'] = 'Museum',
	['4'] = 'Power Plant',
	['5'] = 'Passenger Train',
	['6'] = 'Cargo Train',
	['7'] = 'Cargo Ship',
	['8'] = 'Cargo Plane',
	['9'] = 'Gas Station',
	['10'] = 'Donut Store',
	['11'] = 'Money Truck',
	['12'] = 'Home Vault',
	['13'] = 'Tomb',
	['14'] = 'Casino',
	['15'] = 'Mansion'
}
function get_rob(nome)
	for i, v in pairs(Robberys) do
		if v:lower() == nome:lower() then
			return i
		end
	end
end

function is_opened(rob)
	local roubo = get_rob(rob)

	local State = game:GetService('ReplicatedStorage').RobberyState:FindFirstChild(roubo)

	return (tostring(State) == 'nil' and 'Closed') or
		((State.Value == 1 and 'Open') or (State.Value == 2 and 'stealing') or (State.Value == 3 and 'fechado'))
end


if is_opened("Casino") == "Open" or is_opened("Casino") == "Closed" then
	print(is_opened("Casino"))
end
