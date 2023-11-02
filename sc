

local Robberys = {
	['1'] = 'Bank',
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

function main.is_opened(rob)
	local roubo = get_rob(rob)

	local State = game:GetService('ReplicatedStorage').RobberyState:FindFirstChild(roubo)

	return (tostring(State) == 'nil' and 'fechado') or
		((State.Value == 1 and 'aberto') or (State.Value == 2 and 'roubando') or (State.Value == 3 and 'fechado'))
end




if main.is_opened("Bank") == "aberto" or main.is_opened("Bank") == "roubando" then
	--auto farm (ON)
end
