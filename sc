local Robberys = {
	['1'] = 'bank',
	['2'] = 'Jewelrys',
	['3'] = 'Museum',
	['4'] = 'PowerPlant',
	['5'] = 'Passenger Train',
	['6'] = 'Cargo Train',
	['7'] = 'CargoShip',
	['8'] = 'CargoPlane',
	['9'] = 'GasStations',
	['10'] = 'DonutShop',
	['11'] = 'MoneyTruck',
	['12'] = 'HomeVault',
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
		((State.Value == 1 and 'Open') or (State.Value == 2 and 'stealing') or (State.Value == 3 and 'Closed'))
end


if is_opened("GasStations") == "Open" or is_opened("GasStations") == "Closed" then
	print(is_opened("GasStations"))
end
