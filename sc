

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
function get_rob(name)
	for i, v in pairs(Robberys) do
		if v:lower() == name:lower() then
			return i
		end
	end
end

function is_opened(rob)
	local theft = get_rob(rob)

	local State = game:GetService('ReplicatedStorage').RobberyState:FindFirstChild(theft)

	return (tostring(State) == 'nil' and 'closed') or
		((State.Value == 1 and 'open') or (State.Value == 2 and 'stealing') or (State.Value == 3 and 'closed'))
end




if is_opened("bank") == "open" or is_opened("bank") == "closed" then
	print("Test")
end
