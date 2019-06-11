namespace HotelManagementUI.CheckIn
{
    partial class FormCheckIn
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(FormCheckIn));
            this.splitContainer1 = new System.Windows.Forms.SplitContainer();
            this.splitContainer2 = new System.Windows.Forms.SplitContainer();
            this.buttonQuit = new System.Windows.Forms.Button();
            this.buttonClear = new System.Windows.Forms.Button();
            this.buttonSearch = new System.Windows.Forms.Button();
            this.textBoxIDCard = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.textBoxPriceLowLim = new System.Windows.Forms.TextBox();
            this.textBoxPriceHighLim = new System.Windows.Forms.TextBox();
            this.comboBox1_kind = new System.Windows.Forms.ComboBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.RoomID = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.RoomName = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.RoomPrice = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.RoomKind = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.RoomState = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.RoomRemark = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.dateTimePicker1 = new System.Windows.Forms.DateTimePicker();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer1)).BeginInit();
            this.splitContainer1.Panel1.SuspendLayout();
            this.splitContainer1.Panel2.SuspendLayout();
            this.splitContainer1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer2)).BeginInit();
            this.splitContainer2.Panel1.SuspendLayout();
            this.splitContainer2.Panel2.SuspendLayout();
            this.splitContainer2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // splitContainer1
            // 
            this.splitContainer1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer1.Location = new System.Drawing.Point(0, 0);
            this.splitContainer1.Name = "splitContainer1";
            this.splitContainer1.Orientation = System.Windows.Forms.Orientation.Horizontal;
            // 
            // splitContainer1.Panel1
            // 
            this.splitContainer1.Panel1.Controls.Add(this.splitContainer2);
            // 
            // splitContainer1.Panel2
            // 
            this.splitContainer1.Panel2.BackColor = System.Drawing.Color.White;
            this.splitContainer1.Panel2.Controls.Add(this.pictureBox1);
            this.splitContainer1.Panel2.Controls.Add(this.label2);
            this.splitContainer1.Size = new System.Drawing.Size(626, 450);
            this.splitContainer1.SplitterDistance = 369;
            this.splitContainer1.TabIndex = 1;
            // 
            // splitContainer2
            // 
            this.splitContainer2.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer2.Location = new System.Drawing.Point(0, 0);
            this.splitContainer2.Name = "splitContainer2";
            // 
            // splitContainer2.Panel1
            // 
            this.splitContainer2.Panel1.Controls.Add(this.dateTimePicker1);
            this.splitContainer2.Panel1.Controls.Add(this.label3);
            this.splitContainer2.Panel1.Controls.Add(this.buttonQuit);
            this.splitContainer2.Panel1.Controls.Add(this.buttonClear);
            this.splitContainer2.Panel1.Controls.Add(this.buttonSearch);
            this.splitContainer2.Panel1.Controls.Add(this.textBoxIDCard);
            this.splitContainer2.Panel1.Controls.Add(this.label6);
            this.splitContainer2.Panel1.Controls.Add(this.textBoxPriceLowLim);
            this.splitContainer2.Panel1.Controls.Add(this.textBoxPriceHighLim);
            this.splitContainer2.Panel1.Controls.Add(this.comboBox1_kind);
            this.splitContainer2.Panel1.Controls.Add(this.label1);
            this.splitContainer2.Panel1.Controls.Add(this.label5);
            this.splitContainer2.Panel1.Controls.Add(this.label4);
            // 
            // splitContainer2.Panel2
            // 
            this.splitContainer2.Panel2.Controls.Add(this.dataGridView1);
            this.splitContainer2.Size = new System.Drawing.Size(626, 369);
            this.splitContainer2.SplitterDistance = 294;
            this.splitContainer2.TabIndex = 3;
            // 
            // buttonQuit
            // 
            this.buttonQuit.Location = new System.Drawing.Point(212, 291);
            this.buttonQuit.Name = "buttonQuit";
            this.buttonQuit.Size = new System.Drawing.Size(75, 23);
            this.buttonQuit.TabIndex = 14;
            this.buttonQuit.Text = "退出（&Q）";
            this.buttonQuit.UseVisualStyleBackColor = true;
            this.buttonQuit.Click += new System.EventHandler(this.buttonQuit_Click);
            // 
            // buttonClear
            // 
            this.buttonClear.Location = new System.Drawing.Point(119, 291);
            this.buttonClear.Name = "buttonClear";
            this.buttonClear.Size = new System.Drawing.Size(75, 23);
            this.buttonClear.TabIndex = 13;
            this.buttonClear.Text = "清空(&C)";
            this.buttonClear.UseVisualStyleBackColor = true;
            this.buttonClear.Click += new System.EventHandler(this.buttonClear_Click);
            // 
            // buttonSearch
            // 
            this.buttonSearch.Location = new System.Drawing.Point(24, 291);
            this.buttonSearch.Name = "buttonSearch";
            this.buttonSearch.Size = new System.Drawing.Size(75, 23);
            this.buttonSearch.TabIndex = 12;
            this.buttonSearch.Text = "查找(&S)";
            this.buttonSearch.UseVisualStyleBackColor = true;
            this.buttonSearch.Click += new System.EventHandler(this.buttonSearch_Click);
            // 
            // textBoxIDCard
            // 
            this.textBoxIDCard.Location = new System.Drawing.Point(132, 209);
            this.textBoxIDCard.Name = "textBoxIDCard";
            this.textBoxIDCard.Size = new System.Drawing.Size(100, 21);
            this.textBoxIDCard.TabIndex = 11;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(38, 212);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(65, 12);
            this.label6.TabIndex = 10;
            this.label6.Text = "身份证号：";
            // 
            // textBoxPriceLowLim
            // 
            this.textBoxPriceLowLim.Location = new System.Drawing.Point(132, 167);
            this.textBoxPriceLowLim.Name = "textBoxPriceLowLim";
            this.textBoxPriceLowLim.Size = new System.Drawing.Size(100, 21);
            this.textBoxPriceLowLim.TabIndex = 9;
            this.textBoxPriceLowLim.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.textBoxPriceLowLim_KeyPress);
            // 
            // textBoxPriceHighLim
            // 
            this.textBoxPriceHighLim.Location = new System.Drawing.Point(132, 107);
            this.textBoxPriceHighLim.Name = "textBoxPriceHighLim";
            this.textBoxPriceHighLim.Size = new System.Drawing.Size(100, 21);
            this.textBoxPriceHighLim.TabIndex = 8;
            this.textBoxPriceHighLim.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.textBoxPriceLowLim_KeyPress);
            // 
            // comboBox1_kind
            // 
            this.comboBox1_kind.FormattingEnabled = true;
            this.comboBox1_kind.Items.AddRange(new object[] {
            "单人间",
            "双人间",
            "大床间",
            "标准间",
            "标准间单人住",
            "三人间",
            "四人间",
            "套间",
            "公寓",
            "别墅"});
            this.comboBox1_kind.Location = new System.Drawing.Point(132, 60);
            this.comboBox1_kind.Name = "comboBox1_kind";
            this.comboBox1_kind.Size = new System.Drawing.Size(121, 20);
            this.comboBox1_kind.TabIndex = 7;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(38, 60);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(41, 12);
            this.label1.TabIndex = 0;
            this.label1.Text = "房型：";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(38, 170);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(65, 12);
            this.label5.TabIndex = 2;
            this.label5.Text = "价格下限：";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(38, 116);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(65, 12);
            this.label4.TabIndex = 1;
            this.label4.Text = "价格上限：";
            // 
            // dataGridView1
            // 
            this.dataGridView1.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.RoomID,
            this.RoomName,
            this.RoomPrice,
            this.RoomKind,
            this.RoomState,
            this.RoomRemark});
            this.dataGridView1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dataGridView1.Location = new System.Drawing.Point(0, 0);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.ReadOnly = true;
            this.dataGridView1.RowTemplate.Height = 23;
            this.dataGridView1.Size = new System.Drawing.Size(328, 369);
            this.dataGridView1.TabIndex = 3;
            // 
            // RoomID
            // 
            this.RoomID.DataPropertyName = "Room_ID";
            this.RoomID.HeaderText = "房间号";
            this.RoomID.Name = "RoomID";
            this.RoomID.ReadOnly = true;
            this.RoomID.Visible = false;
            // 
            // RoomName
            // 
            this.RoomName.DataPropertyName = "Room_Name";
            this.RoomName.HeaderText = "房间名";
            this.RoomName.Name = "RoomName";
            this.RoomName.ReadOnly = true;
            // 
            // RoomPrice
            // 
            this.RoomPrice.DataPropertyName = "Price";
            this.RoomPrice.HeaderText = "房间价格";
            this.RoomPrice.Name = "RoomPrice";
            this.RoomPrice.ReadOnly = true;
            // 
            // RoomKind
            // 
            this.RoomKind.DataPropertyName = "KIND";
            this.RoomKind.HeaderText = "房间类型";
            this.RoomKind.Name = "RoomKind";
            this.RoomKind.ReadOnly = true;
            // 
            // RoomState
            // 
            this.RoomState.DataPropertyName = "STATE";
            this.RoomState.HeaderText = "房间状态";
            this.RoomState.Name = "RoomState";
            this.RoomState.ReadOnly = true;
            // 
            // RoomRemark
            // 
            this.RoomRemark.DataPropertyName = "REMARK";
            this.RoomRemark.HeaderText = "备注";
            this.RoomRemark.Name = "RoomRemark";
            this.RoomRemark.ReadOnly = true;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("华文琥珀", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(134)));
            this.label2.Location = new System.Drawing.Point(155, 40);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(132, 25);
            this.label2.TabIndex = 1;
            this.label2.Text = "办理入住：";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(38, 250);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(65, 12);
            this.label3.TabIndex = 15;
            this.label3.Text = "退房日期：";
            // 
            // dateTimePicker1
            // 
            this.dateTimePicker1.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.dateTimePicker1.Location = new System.Drawing.Point(132, 244);
            this.dateTimePicker1.Name = "dateTimePicker1";
            this.dateTimePicker1.Size = new System.Drawing.Size(112, 21);
            this.dateTimePicker1.TabIndex = 16;
            // 
            // pictureBox1
            // 
            this.pictureBox1.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("pictureBox1.BackgroundImage")));
            this.pictureBox1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.pictureBox1.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.pictureBox1.Location = new System.Drawing.Point(313, 23);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(49, 42);
            this.pictureBox1.TabIndex = 0;
            this.pictureBox1.TabStop = false;
            this.pictureBox1.Click += new System.EventHandler(this.pictureBox1_Click);
            // 
            // FormCheckIn
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.AliceBlue;
            this.ClientSize = new System.Drawing.Size(626, 450);
            this.Controls.Add(this.splitContainer1);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "FormCheckIn";
            this.Text = "入住管理";
            this.splitContainer1.Panel1.ResumeLayout(false);
            this.splitContainer1.Panel2.ResumeLayout(false);
            this.splitContainer1.Panel2.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer1)).EndInit();
            this.splitContainer1.ResumeLayout(false);
            this.splitContainer2.Panel1.ResumeLayout(false);
            this.splitContainer2.Panel1.PerformLayout();
            this.splitContainer2.Panel2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer2)).EndInit();
            this.splitContainer2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.SplitContainer splitContainer1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.SplitContainer splitContainer2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox textBoxPriceLowLim;
        private System.Windows.Forms.TextBox textBoxPriceHighLim;
        private System.Windows.Forms.ComboBox comboBox1_kind;
        private System.Windows.Forms.Button buttonQuit;
        private System.Windows.Forms.Button buttonClear;
        private System.Windows.Forms.Button buttonSearch;
        private System.Windows.Forms.TextBox textBoxIDCard;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.DataGridViewTextBoxColumn RoomID;
        private System.Windows.Forms.DataGridViewTextBoxColumn RoomName;
        private System.Windows.Forms.DataGridViewTextBoxColumn RoomPrice;
        private System.Windows.Forms.DataGridViewTextBoxColumn RoomKind;
        private System.Windows.Forms.DataGridViewTextBoxColumn RoomState;
        private System.Windows.Forms.DataGridViewTextBoxColumn RoomRemark;
        private System.Windows.Forms.DateTimePicker dateTimePicker1;
        private System.Windows.Forms.Label label3;


    }
}