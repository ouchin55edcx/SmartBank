<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Demander mon crédit en ligne</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f3f4f6;
            margin: 0;
            padding: 20px;
        }
        .container {
            max-width: 1000px;
            margin: 0 auto;
            background-color: white;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
            overflow: hidden;
        }
        .header {
            padding: 20px;
        }
        .back-link {
            color: #6b7280;
            text-decoration: none;
            font-size: 14px;
        }
        h1 {
            font-size: 24px;
            margin-top: 20px;
        }
        .progress-bar {
            display: flex;
            margin-bottom: 20px;
        }
        .progress-step {
            flex: 1;
            padding: 10px;
            text-align: center;
            background-color: #d1d5db;
        }
        .progress-step.active {
            background-color: #fde047;
        }
        .progress-step:first-child {
            border-top-left-radius: 4px;
            border-bottom-left-radius: 4px;
        }
        .progress-step:last-child {
            border-top-right-radius: 4px;
            border-bottom-right-radius: 4px;
        }
        .form-container {
            display: flex;
            padding: 0 20px 20px;
        }
        .form-main {
            flex: 2;
            padding-right: 20px;
        }
        .form-sidebar {
            flex: 1;
        }
        .form-group {
            margin-bottom: 15px;
        }
        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        select, input {
            width: 100%;
            padding: 8px;
            border: 1px solid #d1d5db;
            border-radius: 4px;
            font-size: 14px;
        }
        button {
            width: 100%;
            padding: 10px;
            background-color: #14b8a6;
            color: white;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
        }
        .disclaimer {
            font-size: 12px;
            color: #6b7280;
            margin-top: 10px;
        }
        .sidebar-content {
            background-color: #f9fafb;
            padding: 15px;
            border-radius: 4px;
        }
        .footer {
            background-color: #f3f4f6;
            padding: 15px 20px;
            font-size: 12px;
            color: #6b7280;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="header">
        <a href="#" class="back-link">← Retour</a>
        <h1>Demander mon crédit en ligne</h1>
    </div>
    <div class="progress-bar">
        <div class="progress-step active"><strong>1</strong> Simuler mon crédit</div>
        <div class="progress-step"><strong>2</strong> Mes coordonnées</div>
        <div class="progress-step"><strong>3</strong> Mes infos personnelles</div>
    </div>
    <div class="form-container">
        <div class="form-main">
            <h2>Mon projet</h2>
            <form>
                <div class="form-group">
                    <label for="project">Mon projet</label>
                    <select id="project">
                        <option>J'ai besoin d'argent</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="status">Je suis</label>
                    <select id="status">
                        <option>Fonctionnaire</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="amount">Montant (en DH)</label>
                    <input type="number" id="amount" value="10000">
                </div>
                <div class="form-group">
                    <label for="duration">Durée (en mois)</label>
                    <input type="number" id="duration" value="24">
                </div>
                <div class="form-group">
                    <label for="monthly">Mensualités (en DH)</label>
                    <input type="number" id="monthly" value="469.4">
                </div>
                <button type="submit">Continuer</button>
                <p class="disclaimer">Sans engagement</p>
            </form>
        </div>
        <div class="form-sidebar">
            <div class="sidebar-content">
                <h2>Mon récapitulatif</h2>
                <p><strong>Mon projet</strong><br>
                    <span style="color: #2563eb;">Prêt Personnel</span></p>
            </div>
        </div>
    </div>
    <div class="footer">
        <p>Simulation à titre indicatif et non contractuelle. La mensualité minimale est de 180 dirhams. Un client Wafasalaf peut bénéficier d'une tarification plus avantageuse en fonction de ses conditions préférentielles.</p>
        <p>Conformément à la loi 09-08, vous disposez d'un droit d'accès, de rectification et d'opposition au traitement de vos données personnelles. Ce traitement est autorisé par la CNDP sous le numéro A-GC-206/2014.</p>
    </div>
</div>
</body>
</html>